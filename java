    <script>
        document.getElementById('hempCreamForm').addEventListener('submit', function(event) {
            event.preventDefault(); // Prevent default form submission

            // Collect form data
            var formData = {
                name: document.getElementById('name').value,
                number: document.getElementById('number').value,
                package: document.getElementById('package').value
            };

            // Send data to Google Apps Script
            fetch('https://script.google.com/macros/s/AKfycby-OtlyP7InHMgWdrfTER4vW0kxeaFGm9RMsN3wNPz2Qot0L-6bAEH7o6AFALdBDM8MCQ/exec', { // Replace with your Google Apps Script web app URL
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formData)
            })
            .then(response => response.text())
            .then(data => {
                console.log(data); // Handle response if needed
                window.location.href = 'thankyou.html'; // Redirect to another page
            })
            .catch(error => {
                console.error('Error:', error); // Handle errors
            });
        });
    </script>
