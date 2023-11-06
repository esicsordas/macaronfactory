import React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import { theme, ThemeProvider } from './theme.js'
import reportWebVitals from './reportWebVitals';
import MainPage from './mainpage/MainPage'
import MacaronList from './macaronlist/MacaronList';
import Story from './story/Story';
import NewMacaronForm from './newmacaron/NewMacaronForm';
import LoginForm from './login/LoginForm';


const router = createBrowserRouter([
  {
    path: "/",
    element: < MainPage />,
  },
  {
    path: "/all-macarons",
    element: <MacaronList />
  },
  {
    path: "/story",
    element: <Story />
  },
  {
    path: "/new-macaron",
    element: <NewMacaronForm />
  },
  {
    path: "/login",
    element: <LoginForm />
  }
])



const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <ThemeProvider theme={theme}>
      <RouterProvider router={router} />
    </ThemeProvider>
  </React.StrictMode>
);


reportWebVitals();
