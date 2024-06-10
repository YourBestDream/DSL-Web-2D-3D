import { useState } from 'react';
import axios from 'axios';
import './App.css';

function App() {
  const [code, setCode] = useState('');
  const [response, setResponse] = useState(null);

  const handleCodeSubmit = () => {
    const data = { code: code }; // Save the code in a JSON object
    axios.post('http://localhost:5000/process-code', data)
      .then(response => {
        setResponse(response.data);
      })
      .catch(error => {
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
