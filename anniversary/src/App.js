import logo from './logo.svg';
import './App.css';
import Header from './header.js';
import RegistrationForm from './registration';
import App1 from './signin.js';
function App() {
  return (
    <div className="App">
      <Header/>
      <RegistrationForm/>
      <App1/>
    </div>
    
  );
}
export default App