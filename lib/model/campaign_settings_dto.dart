//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignSettingsDTO {
  /// Returns a new [CampaignSettingsDTO] instance.
  CampaignSettingsDTO({
    this.countryRegion,
    this.shopName,
    this.showInContext,
    this.showInPremium,
    this.useOpenStat,
    this.localRegion,
  });

  /// Идентификатор региона, в котором находится магазин.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? countryRegion;

  /// Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopName;

  /// Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? showInContext;

  /// Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? showInPremium;

  /// Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? useOpenStat;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignSettingsLocalRegionDTO? localRegion;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignSettingsDTO &&
    other.countryRegion == countryRegion &&
    other.shopName == shopName &&
    other.showInContext == showInContext &&
    other.showInPremium == showInPremium &&
    other.useOpenStat == useOpenStat &&
    other.localRegion == localRegion;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (countryRegion == null ? 0 : countryRegion!.hashCode) +
    (shopName == null ? 0 : shopName!.hashCode) +
    (showInContext == null ? 0 : showInContext!.hashCode) +
    (showInPremium == null ? 0 : showInPremium!.hashCode) +
    (useOpenStat == null ? 0 : useOpenStat!.hashCode) +
    (localRegion == null ? 0 : localRegion!.hashCode);

  @override
  String toString() => 'CampaignSettingsDTO[countryRegion=$countryRegion, shopName=$shopName, showInContext=$showInContext, showInPremium=$showInPremium, useOpenStat=$useOpenStat, localRegion=$localRegion]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.countryRegion != null) {
      json[r'countryRegion'] = this.countryRegion;
    } else {
      json[r'countryRegion'] = null;
    }
    if (this.shopName != null) {
      json[r'shopName'] = this.shopName;
    } else {
      json[r'shopName'] = null;
    }
    if (this.showInContext != null) {
      json[r'showInContext'] = this.showInContext;
    } else {
      json[r'showInContext'] = null;
    }
    if (this.showInPremium != null) {
      json[r'showInPremium'] = this.showInPremium;
    } else {
      json[r'showInPremium'] = null;
    }
    if (this.useOpenStat != null) {
      json[r'useOpenStat'] = this.useOpenStat;
    } else {
      json[r'useOpenStat'] = null;
    }
    if (this.localRegion != null) {
      json[r'localRegion'] = this.localRegion;
    } else {
      json[r'localRegion'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignSettingsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignSettingsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignSettingsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignSettingsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignSettingsDTO(
        countryRegion: mapValueOfType<int>(json, r'countryRegion'),
        shopName: mapValueOfType<String>(json, r'shopName'),
        showInContext: mapValueOfType<bool>(json, r'showInContext'),
        showInPremium: mapValueOfType<bool>(json, r'showInPremium'),
        useOpenStat: mapValueOfType<bool>(json, r'useOpenStat'),
        localRegion: CampaignSettingsLocalRegionDTO.fromJson(json[r'localRegion']),
      );
    }
    return null;
  }

  static List<CampaignSettingsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignSettingsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignSettingsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignSettingsDTO> mapFromJson(dynamic json) {
    final map = <String, CampaignSettingsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignSettingsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignSettingsDTO-objects as value to a dart map
  static Map<String, List<CampaignSettingsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignSettingsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignSettingsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

