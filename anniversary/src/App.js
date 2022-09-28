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
export default App