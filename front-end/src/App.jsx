import { useState } from 'react';
import axios from 'axios';
import './App.css';

function App() {
  const [code, setCode] = useState('');
  const [response, setResponse] = useState(null);

  const handleCodeSubmit = () => {
    axios.post('http://localhost:5000/process-code', { code: code })
      .then(response => {
        // Handle the response from the server here
        setResponse(response.data);
      })
      .catch(error => {
        // Handle any errors here
        console.error('Error processing code:', error);
      });
  };

  return (
    <>
      <div className="app-wrapper">
        <div className="input-area-wrapper">
          <textarea 
            name="code" 
            id="code-input" 
            className='input-area item' 
            cols="30" 
            rows="10"
            value={code}
            onChange={(e) => setCode(e.target.value)}
          ></textarea>
          <button type='submit' className='input-button' onClick={handleCodeSubmit}>Submit</button>
        </div>
        <div className="output-area item">
          {response ?
            <img src={response.imageUrl} alt="output" />
            :
            <p className='no-output'>No output yet</p>
          }
        </div>
      </div>
    </>
  );
}

export default App;
