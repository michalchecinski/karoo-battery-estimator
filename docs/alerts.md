# Alert System

## Warning Triggers

### Route-Aware Warning

Trigger: Predicted battery < route completion + 10% buffer
Message: "Battery may not last. Consider turning on battery saver mode"

### Time-Based Warning

Trigger: <30 minutes remaining
Message: "Low battery: ~25 minutes remaining"

### Optimization Suggestion

Trigger: High drain rate detected
Message: "Reduce brightness to 40% to extend battery 2+ hours"

### Critical Alert

Trigger: <10% battery or <15 minutes
Message: "Critical battery! End navigation & reduce screen use"

### Alert Delivery

- In-ride notification banner (can dismiss)
- Optional audio beep (configurable)
- Reminder every 10 minutes if unresolved
- Don't alert during climbs (via gradient detection)