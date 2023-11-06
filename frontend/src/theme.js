import { createTheme, ThemeProvider } from "@mui/material/styles"


const theme = createTheme({
    palette: {
      primary: {
        main: '#0077FF', 
      },
    },
    typography: {
      fontFamily: 'Noto Serif JP', 
    },
  });

export { theme, ThemeProvider };