# SDK Capabilities

## 1. Battery Data Access

Source: Standard Android BatteryManager API

```kotlin
val batteryManager = getSystemService(BATTERY_SERVICE) as BatteryManager
val currentLevel = batteryManager.getIntProperty(BATTERY_PROPERTY_CAPACITY)
val isCharging = batteryManager.isCharging
```

Available metrics:

Current battery percentage (0-100)
Charging status (charging/discharging)
Battery health
Voltage and temperature (optional)

## 2. Ride State Data

Source: karoo-ext SDK - RideState consumer

```kotlin
karooSystem.addConsumer { rideState: RideState ->
    // RideState enum: IDLE, RECORDING, PAUSED
}
```

Use case: Only calculate drain during active riding, not when stopped/paused

## 3. Speed & Distance Data

Source: karoo-ext SDK

```kotlin
karooSystem.addConsumer { speed: Speed ->
    // Current speed in m/s
}

karooSystem.addConsumer { distance: Distance ->
    // Total distance traveled
}
```

Use case: Calculate km/battery% ratio and predict remaining distance

## 4. Route Navigation Data
Source: karoo-ext SDK (as of v1.1.6+)

```kotlin
// NEW in SDK 1.1.6 (confirmed from RouteGraph developer feedback)
karooSystem.addConsumer { navigationDistance: NavigationDistance ->
    // Distance remaining on loaded route
}
```

Use case: Compare remaining route distance vs. predicted battery range

## 5. Connected Devices

Source: karoo-ext SDK

```kotlin
karooSystem.addConsumer { devices: Devices ->
    // List of connected sensors (BT/ANT+)
    val sensorCount = devices.count()
}
```

Use case: More sensors = higher battery drain (factor into model)

## 6. System Information

Source: Android APIs + karoo-ext

```kotlin
// Screen brightness
val brightness = Settings.System.getInt(contentResolver, Settings.System.SCREEN_BRIGHTNESS)

// Device model (K2 vs K3)
KarooInfo.hardwareType // KAROO_2 or KAROO_3
```

Use case: Brightness is major battery factor; different models have different battery capacities

## What SDK Does NOT Provide (Limitations)

- Direct access to screen-on time (can calculate from timestamps)
- Map zoom level (not critical)
- Specific navigation state (can infer from NavigationDistance)
- Historical battery logs from previous rides (must build our own)

Conclusion: All essential data is accessible. No blockers.
