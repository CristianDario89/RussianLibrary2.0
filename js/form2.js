// Initialize Firebase
  var config = {
    apiKey: "AIzaSyDZKmF_8n1YcKDDMxLIMlcyKo6OJZtYmvI",
    authDomain: "ljubaformsection.firebaseapp.com",
    databaseURL: "https://ljubaformsection.firebaseio.com",
    projectId: "ljubaformsection",
    storageBucket: "ljubaformsection.appspot.com",
    messagingSenderId: "922084985602"
  };
  firebase.initializeApp(config);

var messageRef = firebase.database().ref('message');  //Incializando firebase


//Listen for form submit
document.getElementById('contactFormm').addEventListener('submit',submitForm);



//submit form
function submitForm(e){
    e.preventDefault();
    
    
    //Get values
    var name = getInputVal('name');
   var country = getInputVal('country');
     var gusto = getInputVal('gusto');
  var favorito = getInputVal('favorito');
        var recom = getInputVal('recom');

//console.log(name);
    
    
    //save message
    saveMessage(name, country, gusto, favorito, recom);
    
    //show alert
    document.querySelector('.alert').style.display = 'block';
    
    //Hide alert after 3 seconds
    setTimeout(function(){
            document.querySelector('.alert').style.display = 'none';

        
    },3000);
    
    
    //clear form
    document.getElementById('contactFormm').reset(); 
}
    
 
function getInputVal(id){
        return document.getElementById(id).value;
        
    }

function saveMessage(name, country, gusto, favorito, recom){
   var newMessageRef =  messageRef.push();
    newMessageRef.set({
       name: name,
        country:country,
        gusto:gusto,
        favorito: favorito,
        recom:recom
    });
}