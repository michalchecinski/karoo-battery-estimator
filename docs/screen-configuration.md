# Application Implementation Plan (V1)

This document outlines the initial design and implementation plan for the Karoo Battery Estimator extension.

## 1. Core Screens

The application will consist of three primary screens:

1.  **Display Data:** The main screen showing real-time battery predictions.
2.  **Settings:** For configuring application behavior.
3.  **About:** For support and feedback.

## 2. Navigation

-   **Style:** A `TopAppBar` will be used for navigation.
-   **Structure:** The "Display Data" screen will be the primary view. The `TopAppBar` on this screen will contain action icons to navigate to the "Settings" and "About" screens. This pattern is inspired by other Karoo extensions like ki2.

## 3. Screen Content Details

### Display Data Screen

This screen will provide at-a-glance information about battery status and prediction context.

-   **Primary Metrics:**
    -   Estimated time remaining.
    -   Estimated kilometers remaining.
-   **Influencing Factors (Context):**
    -   Number of connected sensors (e.g., "3 sensors connected").
    -   Recent battery usage statistics (e.g., "Used 5% in last 30 mins / 10 km").

### Settings Screen (V1)

For the initial version, settings will be focused exclusively on alert configuration.

-   **Low Battery Alert:**
    -   Toggle to enable/disable.
    -   Slider to set the time-based warning threshold.
-   **Route-Aware Alert:**
    -   Toggle to enable/disable.
    -   Slider to adjust the route-distance safety buffer.
-   **Enable Audio Beep:**
    -   Toggle to enable/disable audible notifications for alerts.

### About Screen

This screen will provide links to external resources without requiring text input on the device.

-   **Feedback:** A QR code linking to a feedback board or form.
-   **Support:** A QR code linking to a "Buy Me a Coffee" or similar support page.

## 4. Future Work (Post-V1)

The following features were discussed and deferred to a future version to simplify the initial release.

-   **Prediction Model Tuning (Settings):**
    -   **Prediction Bias:** Allow users to choose between `Conservative`, `Balanced`, and `Optimistic` prediction styles.
    -   **Clear Prediction History:** A button to allow users to clear the app's learned battery performance data.
