# Battery Consumption Factors

## Primary Factors (High Impact)

Screen Brightness

Community reports: 10% battery/hour at 40% brightness
Likely 15-20% at 100% brightness
Single biggest variable


GPS Polling Rate

High accuracy mode drains faster
Karoo uses high accuracy for navigation
Factor: ~5-8% additional drain


Screen On/Off Ratio

Auto-sleep settings vary by user
Some keep screen always on
Factor: 30-50% difference


Number of Connected Sensors

Each BT/ANT+ connection adds overhead
Estimated: ~1-2% per sensor
Power meter + HR + cadence + radar + Di2 = 5-10% impact


## Secondary Factors (Medium Impact)

Navigation Active

Route rendering + turn-by-turn
Factor: ~5% additional


Companion App Connection

BT bridge for phone
Factor: ~3-5% additional


Map Interactions

Panning/zooming during ride
Rendering complex tiles
Factor: Variable, ~2-5%


Extensions Running

Overlay extensions (PowerBar, RouteGraph)
Background services
Factor: ~1-3% per heavy extension



## Environmental Factors (Low Impact but Measurable)

Temperature

Cold weather significantly reduces capacity
Known issue: batteries drain faster in winter
Factor: Up to 20-30% reduction in freezing temps


Device Age

Battery degradation over time
Older Karoos have reduced capacity
Factor: 10-20% loss after 2-3 years