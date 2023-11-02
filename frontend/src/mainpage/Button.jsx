import { useNavigate } from "react-router-dom";

const Button = ( {navigation, text} ) => {
    const navigate = useNavigate();

    return (
        <div>
            <button onClick={() => navigate(navigation)}>{text}</button>
        </div>
    )
}

export default Button;