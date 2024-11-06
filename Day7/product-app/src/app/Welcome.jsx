import React, { Component } from 'react'
import './Welcome.css'; // Import CSS file for styling

const Welcome = () => {
    return (
        <div className="welcome-container">
            <header className="welcome-header">
                <h1>Welcome to Our Website!</h1>
            </header>
            <main className="welcome-main">
                <p>We are glad to have you here. Explore our content and enjoy!</p>
                <a href="/nextpage" className="get-started-button">Get Started</a>
            </main>
            <footer className="welcome-footer">
                <p>&copy; 2024 Your Company Name</p>
            </footer>
        </div>
    );
};

export default Welcome;
