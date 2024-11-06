document.getElementById('fetch-user').addEventListener('click', fetchRandomUser);

function fetchRandomUser() {
    fetch('https://randomuser.me/api/')
        .then(response => response.json())
        .then(data => {
            const user = data.results[0];
            displayUser(user);
        })
        .catch(error => console.error('Error fetching user:', error));
}

function displayUser(user) {
    const userDisplay = document.getElementById('user-display');
    userDisplay.innerHTML = `
        <h2>${user.name.title} ${user.name.first} ${user.name.last}</h2>
        <img src="${user.picture.large}" alt="User Picture">
        <p>Email: ${user.email}</p>
        <p>Location: ${user.location.city}, ${user.location.country}</p>
    `;
}
