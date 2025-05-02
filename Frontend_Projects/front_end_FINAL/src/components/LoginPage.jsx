import React, { useState } from 'react';

function LoginPage() {
	const [username, setUsername] = useState("");
	const [password, setPassword] = useState("");

	const handleUsernameChange = (event) => {
		setUsername(event.target.value);
	};

	const handlePasswordChange = (event) => {
		setPassword(event.target.value);
	};

	const handleLogin = (event) => {
		event.preventDefault();
		console.log(`Username: ${username}, Password: ${password}`);
		// Here you can add logic for user authentication
	};

	return (
		<div>
			<h2>Login Page</h2>
			<form onSubmit={handleLogin}>
				<label>
					Username:
					<input
						type="text"
						value={username}
						onChange={handleUsernameChange}
					/>
				</label>
				<br/>
				<label>
					Password:
					<input
						type="password"
						value={password}
						onChange={handlePasswordChange}
					/>
				</label>
				<br/>
				<button type="submit">Login</button>
			</form>
		</div>
	);
}

export default LoginPage;
