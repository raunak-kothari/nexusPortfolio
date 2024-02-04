						function validateForm(event) {
							// Clear existing error messages
							// Add this part to clear the errors before re-validation
							document.getElementById('nameError').innerHTML = '';
							document.getElementById('emailError').innerHTML = '';
							document.getElementById('mobileError').innerHTML = '';
							document.getElementById('messageError').innerHTML = '';

							// Validate Name
							var name = document.getElementById('name').value;
							if (!/^[a-zA-Z ]+$/.test(name)) {
								document.getElementById('nameError').innerHTML = '* Name should not contain numbers or any symbols.';
								event.preventDefault();
							}

							// Validate Email
							var email = document.getElementById('email').value;
							if (!isValidEmail(email)) {
								document.getElementById('emailError').innerHTML = '* Please enter a valid email address.';
								event.preventDefault();
							}

							// Validate Mobile Number
							var mobile = document.getElementById('mobile').value;
							if (!/^[6-9]\d{9}$/.test(mobile)) {
								document.getElementById('mobileError').innerHTML = '* Please enter a valid mobile number.';
								event.preventDefault();
							}

							// Validate Message
							var message = document.getElementById('message').value;
							if (message.trim() === "") {
								document.getElementById('messageError').innerHTML = '* Please enter your message.';
								event.preventDefault();
							}
						}

						function isValidEmail(email) {
							// Add your email validation logic here
							// You can use regular expressions or other methods
							return true; // Placeholder return value
						}