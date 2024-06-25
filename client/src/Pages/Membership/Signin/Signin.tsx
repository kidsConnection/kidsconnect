import { useState } from "react";
import { Link, useNavigate, useNavigationType } from "react-router-dom";
import { useCookies } from "react-cookie";

import Toast from "../../../Component/Common/Toast/Toast";
import InputText from "../../../Component/Common/Input/InputText";
import InputPassword from "../../../Component/Common/Input/InputPassword";
import FilledButton from "../../../Component/Common/Button/FilledButton";
import UserTypeCheckbox from "../../../Component/Membership/UserTypeCheckbox";
import { usePostSignin } from "../../../Services/ApiHooks";
import { changeInputEvent } from "../../../Assets/CommonType/EventType";
import { ToastMessageTypes } from "../Signup/SignupType";
import { emailRegex, passwordRegex } from "../Signup/Signup";

function Signin() {
  const [selectedUserType, setSelectedUserType] = useState<string>("parents");
  const [postDataValue, setPostDataValue] = useState(initialPostData);
  const isFormInvalid = validateCommonFields(postDataValue);
  const [toastMessage, setToastMessage] = useState<ToastMessageTypes>(
    {} as ToastMessageTypes
  );

  const [cookies, setCookie] = useCookies(["token"]);
  const navigate = useNavigate();
  const useNavigation = useNavigationType();

  const handleChangeReducer = (e: changeInputEvent) => {
    const { name, value } = e.target;
    setPostDataValue({ ...postDataValue, [name]: value });
  };

  const handleFormSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    usePostSignin(
      selectedUserType,
      postDataValue,
      setToastMessage,
      navigate,
      useNavigation,
      setCookie
    );
  };

  return (
    <div>
      {toastMessage.type === "success" && (
        <Toast variant={toastMessage.type} title={toastMessage.message} />
      )}
      <div>
        <h2>🔑 로그인</h2>
        <span>
          가입을 안 하셨나요? <Link to="/signup">회원가입 하기</Link>
        </span>
      </div>
      <section>
        <div>
          <h3>회원 유형</h3>
          <span>가입했던 회원 유형을 선택 후 로그인해 주세요</span>
          <form onSubmit={handleFormSubmit}>
            <UserTypeCheckbox onClick={setSelectedUserType} />
            <div>
              <InputText inputType="email" dispatch={handleChangeReducer} />
              <InputPassword dispatch={handleChangeReducer} />
              <FilledButton
                submit={true}
                text="로그인"
                disabled={isFormInvalid}
              />
              {toastMessage.type === "failed" && (
                <span>{toastMessage.message}</span>
              )}
            </div>
          </form>
        </div>
      </section>
    </div>
  );
}

export default Signin;

const validateCommonFields = (data: PostDataType) => {
  const isEmailValid = emailRegex.test(data.email);
  const isPasswordValid = passwordRegex.test(data.password);

  return data.email && data.password && isEmailValid && isPasswordValid
    ? false
    : true;
};

const initialPostData: PostDataType = {
  email: "",
  password: "",
};

interface PostDataType {
  email: string;
  password: string;
}
