// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}


var image_number = 1;
/**
 * Changes page background in a loop.
 */
function changeTheme() {
    var image_string;

    switch (image_number) {
        case 0:
            image_string = "url(../images/background.png)";
            image_number = 1;
            break;
        case 1:
            image_string = "url(../images/background-bottom.png)";
            image_number = 2;
            break;
        case 2:
            image_string = "url(../images/background-dark.png)";
            image_number = 3;
            break;
        case 3:
            image_string = "url(../images/background-dark-bottom.png)";
            image_number = 4;
            break;
        case 4:
            image_string = "url(../images/background-sofia.png)";
            image_number = 5;
            break;
        case 5:
            image_string = "url(../images/background-sofia-bottom.png)";
            image_number = 0;
            break;
    }
    document.getElementById("page-body").style.backgroundImage = image_string;
}