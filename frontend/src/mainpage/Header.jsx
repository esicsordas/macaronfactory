import Button from "./Button";

const Header = () => {
return (
    <>
    <Button navigation={"/all-macarons"} text={"SHOP"} />
    <Button navigation={"/story"} text={"OUR STORY"}/>
    <Button navigation={"/new-macaron"} text={"CREATE MACARON"} />
    <h2>MacaronFactory</h2>
    <Button navigation={"/login"} text={"LOGIN"}></Button>
    </>
)
}

export default Header;