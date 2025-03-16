import './App.css';
import {useEffect, useState} from "react";

function App() {
  const [entity, setEntity] = useState(null);
  const getEntities = async () => {
    const response = await fetch(`/api/`);
    const json = await response.json();
    setEntity(json);
  }

  useEffect(() => {
      getEntities();
  })

  return (
    <div className="App">
        <div className="App-title">
            <h1>My-app</h1>
        </div>

      <div className="App-content">
          {entity?.map(entit => <div className={"App-entity"} key={entit.id}>{entit.name} + {entit.description}</div>)}
      </div>
    </div>
  );
}

export default App;
