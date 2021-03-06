import axios from 'axios';
import { toast } from 'react-toastify';
import icon from '../../assets/img/notification-icon.png';
import { BASE_URL } from '../../utils/request';
import "./styles.css";

type Props = {
    saleId: number;
}

function handleClick(id: number) {
axios (`${BASE_URL}/sales/52/notification`)
.then(res => {
toast.info('SMS enviada com sucesso!')
})
}


function NotificationButton({ saleId }: Props) {
    return(
        <>
        <div className='red-button' onClick={()=> handleClick(saleId)}>
            <img src={icon} alt="" />
        </div>
      
        </>
     )
   
   }
   
   export default NotificationButton;
   