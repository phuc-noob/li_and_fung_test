import ContactList from './components/ContactList';
import { useState } from "react";
import { BrowserRouter as Router, Route, Routes  } from 'react-router-dom';
import ContactDetailPage from './pages/ContactDetailPage';

function App() {
  return (
    <Router>
        <Routes>
          <Route path="/" element={<ContactList/>}/>
          <Route path="/detail/:email" element={<ContactDetailPage />} />
        </Routes>
    </Router>
  )
}

export default App;