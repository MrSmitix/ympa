//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EnrichedModelDTO {
  /// Returns a new [EnrichedModelDTO] instance.
  EnrichedModelDTO({
    this.id,
    this.name,
    this.prices,
    this.offers = const [],
    this.offlineOffers,
    this.onlineOffers,
  });

  /// Идентификатор модели товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Название модели товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ModelPriceDTO? prices;

  /// Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
  List<ModelOfferDTO>? offers;

  /// Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? offlineOffers;

  /// Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? onlineOffers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EnrichedModelDTO &&
    other.id == id &&
    other.name == name &&
    other.prices == prices &&
    _deepEquality.equals(other.offers, offers) &&
    other.offlineOffers == offlineOffers &&
    other.onlineOffers == onlineOffers;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (prices == null ? 0 : prices!.hashCode) +
    (offers == null ? 0 : offers!.hashCode) +
    (offlineOffers == null ? 0 : offlineOffers!.hashCode) +
    (onlineOffers == null ? 0 : onlineOffers!.hashCode);

  @override
  String toString() => 'EnrichedModelDTO[id=$id, name=$name, prices=$prices, offers=$offers, offlineOffers=$offlineOffers, onlineOffers=$onlineOffers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.prices != null) {
      json[r'prices'] = this.prices;
    } else {
      json[r'prices'] = null;
    }
    if (this.offers != null) {
      json[r'offers'] = this.offers;
    } else {
      json[r'offers'] = null;
    }
    if (this.offlineOffers != null) {
      json[r'offlineOffers'] = this.offlineOffers;
    } else {
      json[r'offlineOffers'] = null;
    }
    if (this.onlineOffers != null) {
      json[r'onlineOffers'] = this.onlineOffers;
    } else {
      json[r'onlineOffers'] = null;
    }
    return json;
  }

  /// Returns a new [EnrichedModelDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EnrichedModelDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EnrichedModelDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EnrichedModelDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EnrichedModelDTO(
        id: mapValueOfType<int>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        prices: ModelPriceDTO.fromJson(json[r'prices']),
        offers: ModelOfferDTO.listFromJson(json[r'offers']),
        offlineOffers: mapValueOfType<int>(json, r'offlineOffers'),
        onlineOffers: mapValueOfType<int>(json, r'onlineOffers'),
      );
    }
    return null;
  }

  static List<EnrichedModelDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EnrichedModelDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EnrichedModelDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EnrichedModelDTO> mapFromJson(dynamic json) {
    final map = <String, EnrichedModelDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EnrichedModelDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EnrichedModelDTO-objects as value to a dart map
  static Map<String, List<EnrichedModelDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EnrichedModelDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EnrichedModelDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

