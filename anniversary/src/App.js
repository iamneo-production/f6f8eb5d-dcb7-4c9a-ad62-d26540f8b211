import logo from './logo.svg';
import './App.css';
import Header from './header.js';
import RegistrationForm from './registration';
import signin from './signin.js';
function App() {
  return (
    <div className="App">
      <Header/>
      <RegistrationForm/>
    </div>
    
  );
}
export default App;
/*
import React from 'react';
import ReactDOM from 'react-dom';
import EventDashboard from './event-dashboard';
import EventInvitees from './event-invitees';
import LoginForm from './auth/login-form'


class App extends React.Component
{
    render()
    {
        return (
            <div>
                <LoginForm />
            </div>
        )
    }
}

ReactDOM.render(<App/>,document.getElementById("app"));*/