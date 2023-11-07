import { useNavigate } from "react-router-dom";
import { Button } from "@mui/material"

const MyButton = ( {navigation, text } ) => {
    const navigate = useNavigate();

    return (
        <div>
            <Button variant="contained" sx={{ bgcolor: "primary.light", m:2, ":hover": {bgcolor: "primary.dark", color: "white"}}} onClick={() => navigate(navigation)}>{text}</Button>
        </div>
    )
}

export default MyButton;