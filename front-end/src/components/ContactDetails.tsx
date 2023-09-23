import '../stypes/Contact.css'
import React from "react";
import { contacts } from '../data/contact';
import { log } from 'console';

interface Contact {
  name: string;
  phone: string;
  address: string;
  age: string;
  email: string;
}

interface ContactDetailsProps {
  contact: Contact | null;
}

const ContactDetails: React.FC<ContactDetailsProps> = ({ contact }) => {
  if (!contact) {
    return <div>Select a contact to view details.</div>;
  }

  return (
    <div className='card'>
      <h3>Name: {contact.name}</h3>
      <h3>Age: {contact.age}</h3>
      <h3>Email: {contact.email}</h3>
      <h3>Address: {contact.address}</h3>
      <h3>Phone: {contact.phone}</h3>
    </div>
  );
};

export default ContactDetails;
