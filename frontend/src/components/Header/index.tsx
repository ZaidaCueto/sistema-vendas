import logo from '../../assets/img/logo.svg';
import "./styles.css";


function Header() {
    return(
        <div className="logo-container">
        <img src={logo} alt="logo" />
        <h1>Sistema de controle de vendas</h1>
        <p>
          Desenvolvido por
          <a href="https://www.linkedin.com/in/zaidacuetoa">  Zaida Cueto</a>
        </p>
    </div>
     
     )
   
   }
   
   export default Header;
   