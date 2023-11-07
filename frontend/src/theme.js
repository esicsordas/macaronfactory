import { createTheme, ThemeProvider, CssBaseline } from "@mui/material"


const theme = createTheme({
    palette: {
      primary: {
        main: '#B1F2FF', 
        dark: '#00A8CE',
        light : '#E9FDFF',
        soft: '#FCFCD4'
      },
    },
    typography: {
      fontFamily: 'Noto Serif JP', 
    },
    components: {
        MuiCssBaseline: {
          styleOverrides: `
            .title {
                font-size: 23px;
            }
          `
        }
    }
  });

export { theme, ThemeProvider, CssBaseline };