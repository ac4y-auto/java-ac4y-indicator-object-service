# Architektura - java-ac4y-indicator-object-service

## Attekintes

ObjectService reteg az indikator modulhoz tipusos keres/valasz DTO-kkal analitika, transzfer, egyenleg, storno, torles es lista muveletekhez.

## Szerkezet

```
src/main/java/ac4y/indicator/service/object/
  Ac4yIndicatorObjectService.java               - Fo szolgaltatas osztaly
  analytics/                                    - Analitika insert DTO-k (4 fajl)
  common/                                       - Kozos bazis DTO-k (11 fajl)
  delete/                                       - Torles muvelet DTO-k (12 fajl)
  get/balance/                                  - Egyenleg lekerdezes DTO-k (10 fajl)
  get/minus/                                    - Terhelesi lekerdezes DTO-k (8 fajl)
  get/plus/                                     - Jovairas lekerdezes DTO-k (8 fajl)
  list/analytics/                               - Analitika lista DTO-k (12 fajl)
  list/balancehistory/                          - Egyenleg tortenet lista DTO-k (4 fajl)
  list/transfer/                                - Transzfer lista DTO-k (10 fajl)
  maintain/                                     - Karbantartas DTO-k (4 fajl)
  storno/                                       - Sztorno muvelet DTO-k (16 fajl)
  transfer/                                     - Transzfer DTO-k (4 fajl)
```

## Fuggosegek

- ac4y-indicator (domain es perzisztencia)
- ac4y-log-basic, ac4y-log-object-service (naplozas)
- ac4y-g8h-basic, ac4y-g8h-object-service (GUID-HumanId)
- ac4y-service-domain, ac4y-service-common (szolgaltatas keretrendszer)
- Log4j 2

## Eredet

Az `IJIndicatorModule/Ac4yIndicatorObjectService` modulbol kinyerve.
