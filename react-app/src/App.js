import React, { useState, useEffect } from 'react';
import './App.css';
import Axios from 'axios';

function App() {
  const [user, setUser] = useState('');
  useEffect(() => {
    Axios.post("/api/user").then((response) => {
      if(response.data) {
        console.log(response.data);
        setUser(response.data);
      } else {
        alert("failed to ");
      }
    });
  }, []);
  return (
    <div className="App">
      <header className="App-header">
        <h1>hello~!</h1>
        <h1>{user.user}</h1>
        <h1>{user.email}</h1>
      </header>
    </div>
  );
}
export default App;