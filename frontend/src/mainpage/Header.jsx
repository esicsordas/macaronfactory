import MyButton from "./Button";
import { AppBar, Container, Box, Typography } from "@mui/material";

const Header = () => {
  return (
    <AppBar
      sx={{
        position: "fixed",
        bgcolor: "primary.main",
      }}
    >
      <Container
        maxWidth="xl"
        sx={{
          display: "flex",
          justifyContent: "space-between",
          alignItems: "center",
          position: "relative",
        }}
      >
        <Box sx={{ display: "flex" }}>
          <MyButton navigation={"/all-macarons"} text={"SHOP"} />
          <MyButton navigation={"/story"} text={"OUR STORY"} />
          <MyButton navigation={"/new-macaron"} text={"CREATE MACARON"} />
        </Box>
        <Box
          sx={{
            position: "absolute",
            left: "50%",
            transform: "translateX(-50%)",
          }}
        >
          <Typography sx={{ m: 1 }} class="title">
            MacaronFactory
          </Typography>
        </Box>
        <Box>
          <MyButton navigation={"/login"} text={"LOGIN"} />
        </Box>
      </Container>
    </AppBar>
  );
};

export default Header;
