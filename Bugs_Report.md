### Bug 01: **[Matches Page - App Crash]** The app is crashed when I clicked on the 'Refresh' button multiple times.
- **Description:** The app crashes when the 'Refresh' button is clicked multiple times on the "Today's Match" page.
- **Steps to Reproduce:**
  1. Navigate to the **'Matches'** page.
  2. Click on the **'Today’s Match'** section.
  3. Select any match listed for today.
  4. Click the **'Refresh'** button multiple times quickly.

- **Expected Result:** The page should refresh successfully without crashing.
- **Actual Result:** The app crashes after clicking the 'Refresh' button multiple times.
- **Status:** Open
- **Priority:** Medium
- **Severity:** High
- **Environment:**
   - **Device Type:** iPhone 13 Pro Max
   - **iOS:** 18.1

https://github.com/user-attachments/assets/5089d8c2-7fb9-41b2-81fc-d5b36a91666f


### Bug 02: **[Main Page - App Crash]** The app crashes when clicking the filter twice and then attempting to post a comment.

- **Description:** The app crashes when the filter is clicked twice, followed by an attempt to post a comment.  
- **Steps to Reproduce:**
  1. Navigate to the **Home Page**.
  2. Go to the **Today's Match** section.
  3. Click on the **Comment Icon**.
  4. Apply a filter on the page.
  5. Click the filter button again (double-click).
  6. Attempt to post a comment after applying the filter twice.

- **Expected Result:** The comment should be posted successfully without the app crashing.  
- **Actual Result:** The app crashes after clicking the filter twice and attempting to post a comment.  
- **Status:** Open  
- **Priority:** High  
- **Severity:** High  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1  

https://github.com/user-attachments/assets/a432eb31-3500-476c-87d2-7ca3e2cdc20f


### Bug 03: **[More Page - Filtre Issue]** Filter functionality not working when accessed from 'More' page and scrolling

- **Description:** The filter functionality does not work when navigating from the "More" page, scrolling down to the matches section, and attempting to apply a filter.  
- **Steps to Reproduce:**
  1. Navigate to the **More** page.
  2. Go to the **Championships** section from the "More" page.
  3. Select **Egyptian league** and click to proceed.
  4. Select **Matches** and scroll down.
  5. Scroll down to the filter options.
  6. Attempt to apply a filter on the matches.

- **Expected Result:** The filter should be applied successfully to the displayed matches.  
- **Actual Result:** The filter does not work, and the matches are not filtered after attempting to apply the filter.  
- **Status:** Open  
- **Priority:** Medium  
- **Severity:** High  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1

https://github.com/user-attachments/assets/7d1bab40-5bd4-4c47-a3cc-da3c489853a0


### Bug 04: **[Videos Page - Notification Handling]** App not redirecting when notification clicked in foreground after video playback.

- **Description:** Notifications do not redirect to the relevant page after the app is brought to the foreground, when the user was previously watching a video in the app before placing it in the background.  
- **Steps to Reproduce:**
  1. Start watching a video in the app.
  2. Minimize the app to the background.
  3. Receive a notification while the app is in the background.
  4. Tap on the notification to bring the app to the foreground.

- **Expected Result:** The app should redirect to the relevant page based on the notification when brought to the foreground.  
- **Actual Result:** The app does not redirect to the relevant page, and remains on the video page.  
- **Status:** Open  
- **Priority:** High  
- **Severity:** Medium  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1 

https://github.com/user-attachments/assets/33ed9e6c-ca81-4a63-a6c3-40180fcbce7d


### Bug 05: **[Matches Page - Comment Submission]** User unable to post comment when changing filters multiple times.

- **Description:** The user cannot write a comment after navigating to "Today's Match," clicking the comment icon, changing the filter multiple times, and attempting to comment. The keyboard does not register any input.    
- **Steps to Reproduce:**
  1. Navigate to the **Matches** page.
  2. Go to the **Today's Match** section.
  3. Click on the **Comment Icon** to open the comment section.
  4. Change the filter multiple times.
  5. Attempt to write a comment.

- **Expected Result:** The user should be able to write a comment in the input field after changing the filter multiple times.  
- **Actual Result:** The keyboard does not register any input, and the user is unable to write or post a comment.  
- **Status:** Open  
- **Priority:** High  
- **Severity:** High  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1 

https://github.com/user-attachments/assets/99f48df7-2ff3-4567-bf3a-3d91bab9af99


### Bug 06: **[Matches Page - Video Playback]** The video does not redirect to the app when clicked from the slide bar after playing in the background.

- **Description:** After playing a video in the app and sending it to the background, the sound continues. However, clicking the video from the mobile slide bar does not redirect to the video in the app.  
- **Steps to Reproduce:**
  1. Navigate to the **Video Page** in the app.
  2. Play a video.
  3. Minimize the app to the background.
  4. Click on the video from the mobile slide bar.

- **Expected Result:** The app should redirect to the video and resume playback when clicked from the slide bar.  
- **Actual Result:** Clicking on the video from the slide bar does not redirect to the video in the app, and only the sound plays.  
- **Status:** Open  
- **Priority:** Medium  
- **Severity:** High  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1 

https://github.com/user-attachments/assets/d7c75a4b-c9b5-4df1-964a-42e558c8167a


### Bug 07: **[Main Page - Scroll Behavior]**  Scroll functionality not working correctly when subscription banner appears on the homepage.

- **Description:** When the subscription banner appears at the bottom of the screen on the home page, the scroll down functionality does not work correctly. It only works after scrolling up and then scrolling down again.    
- **Steps to Reproduce:**
  1. Navigate to the **Home Page**.
  2. Wait for the **Subscription Banner** to appear at the bottom of the screen.
  3. Attempt to scroll down the page.

- **Expected Result:** The page should scroll down smoothly even with the subscription banner at the bottom.  
- **Actual Result:** The scroll down does not work correctly until the user scrolls up and then scrolls down again.  
- **Status:** Open  
- **Priority:** Medium  
- **Severity:** Medium  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1
 
https://github.com/user-attachments/assets/d1787f3f-f3de-440b-9934-6a3a1dfc98a1


### Bug 08: **[App Behavior - Internet Disconnection]** App returns to home page when attempting to reconnect on any page.

- **Description:** When the internet connection is disconnected and the user is on any page (e.g., Matches), clicking on "Try to connect to the internet" automatically redirects the app to the home page instead of attempting to reconnect.  
- **Steps to Reproduce:**
  1. Navigate to any page in the app (e.g., **Matches**).
  2. Disconnect the internet connection.
  3. Click on the **"Try to connect to the internet"** option.

- **Expected Result:** The app should attempt to reconnect to the internet without redirecting to the home page.  
- **Actual Result:** The app redirects to the **Home Page** when trying to reconnect to the internet.  
- **Status:** Open  
- **Priority:** High  
- **Severity:** Medium  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1
 
https://github.com/user-attachments/assets/b295c1b3-d01c-4914-9fc8-8c9a17257383


### Bug 09: [Comment Page - UX Enhancement]** Missing loading icon when data is loading on the comment page

- **Description:** No loading icon is shown when the comment page is opened, and data is still loading, leading to a lack of visual feedback for the user.  
- **Steps to Reproduce:**
  1. Navigate to the **Comment Page**.
  2. Observe that the page loads without any loading indicator, even though data is being fetched.

- **Expected Result:** A loading icon should be displayed while the comment page data is loading.  
- **Actual Result:** No loading icon is displayed, giving no indication that data is loading.  
- **Status:** Open  
- **Priority:** Medium  
- **Severity:** Low  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1
     
 
  ### Bug 10: [Main Page - UI Enhancement]** Camera Icon Overlaps with Image.

- **Description:** The camera icon overlaps with the image on the main page, causing a poor user interface experience.  
- **Steps to Reproduce:**
  1. Navigate to the **Main Page**.
  2. Observe the camera icon appearing over the image.

- **Expected Result:** The camera icon should not overlap with the image and should be positioned appropriately.  
- **Actual Result:** The camera icon overlaps with the image, affecting the layout.  
- **Status:** Open  
- **Priority:** Medium  
- **Severity:** Medium  
- **Environment:**  
   - **Device Type:** iPhone 13 Pro Max  
   - **iOS:** 18.1
     
![Camera_Icon_Overlaps_with_Image](https://github.com/user-attachments/assets/a2fbe023-f742-4b9f-a81f-e06609548c33)





  




     




