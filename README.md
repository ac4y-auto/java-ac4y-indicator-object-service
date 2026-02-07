# java-ac4y-indicator-object-service

Indicator ObjectService layer with typed request/response DTOs for analytics, transfers, balance, storno, delete, and list operations.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-indicator-object-service`
- **Version**: `1.0.0`

## Description

ObjectService wrapper for the indicator module providing typed request/response DTOs across multiple operation categories: analytics, transfers, balance queries (plus/minus), storno (reversal), delete, maintain, and list operations with count support.

### Key Classes

- `Ac4yIndicatorObjectService` - Main service class wrapping all indicator operations
- `analytics/` - Analytics insert request/response DTOs
- `transfer/` - Transfer request/response DTOs
- `get/balance/`, `get/plus/`, `get/minus/` - Balance, credit, debit query DTOs
- `delete/` - Delete operations for analytics, transfers, balance history
- `storno/` - Storno (reversal) operations for analytics and transfers
- `maintain/` - Maintenance operation DTOs
- `list/analytics/`, `list/transfer/`, `list/balancehistory/` - List query DTOs with count support
- `common/` - Shared base request/response classes

## Dependencies

- `ac4y-indicator` (core domain and persistence)
- `ac4y-log-basic`, `ac4y-log-object-service` (logging)
- `ac4y-g8h-basic`, `ac4y-g8h-object-service` (GUID-HumanId mapping)
- `ac4y-service-domain`, `ac4y-service-common` (service framework)

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJIndicatorModule/Ac4yIndicatorObjectService`.
