import React from "react";
import { BrowserRouter, Switch, Route, Redirect } from "react-router-dom";
import Home from "./components/Home";
import Join from "./components/Join";
import Login from "./components/Login";
import Posting from "./components/Posting";
import MyPage from "./components/MyPage";
import SectorPage from "./components/SectorPage";

import "./style.css";

function App() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/join" exact component={Join} />
        <Route path="/login" exact component={Login} />
        <Route path="/mypage" exact component={MyPage} />
        <Route path="/posting" exact component={Posting} />
        <Route path="/sector" exact component={SectorPage} />
        <Redirect path="*" to="/" />
      </Switch>
    </BrowserRouter>
  );
}

export default App;
