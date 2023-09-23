import ContactDetails from "../components/ContactDetails";
import '../stypes/Contact.css'
import { contacts } from "../data/contact";
import { useParams } from 'react-router-dom';

export default function ContactDetailPage() {
    const { email } = useParams();
    const contact =  contacts.find((c) => c.email === email);
    console.log(email)
    return (
        <div className="center">
            <h1>THIS IS DETAIL CARD</h1>
            <ContactDetails contact={contact!}/>
        </div>
    );
  }