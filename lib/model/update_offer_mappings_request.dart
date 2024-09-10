//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOfferMappingsRequest {
  /// Returns a new [UpdateOfferMappingsRequest] instance.
  UpdateOfferMappingsRequest({
    this.offerMappings = const [],
    this.onlyPartnerMediaContent,
  });

  /// Перечень товаров, которые нужно добавить или обновить.
  List<UpdateOfferMappingDTO> offerMappings;

  /// Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? onlyPartnerMediaContent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOfferMappingsRequest &&
    _deepEquality.equals(other.offerMappings, offerMappings) &&
    other.onlyPartnerMediaContent == onlyPartnerMediaContent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerMappings.hashCode) +
    (onlyPartnerMediaContent == null ? 0 : onlyPartnerMediaContent!.hashCode);

  @override
  String toString() => 'UpdateOfferMappingsRequest[offerMappings=$offerMappings, onlyPartnerMediaContent=$onlyPartnerMediaContent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerMappings'] = this.offerMappings;
    if (this.onlyPartnerMediaContent != null) {
      json[r'onlyPartnerMediaContent'] = this.onlyPartnerMediaContent;
    } else {
      json[r'onlyPartnerMediaContent'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateOfferMappingsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOfferMappingsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOfferMappingsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOfferMappingsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOfferMappingsRequest(
        offerMappings: UpdateOfferMappingDTO.listFromJson(json[r'offerMappings']),
        onlyPartnerMediaContent: mapValueOfType<bool>(json, r'onlyPartnerMediaContent'),
      );
    }
    return null;
  }

  static List<UpdateOfferMappingsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOfferMappingsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOfferMappingsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOfferMappingsRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateOfferMappingsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOfferMappingsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOfferMappingsRequest-objects as value to a dart map
  static Map<String, List<UpdateOfferMappingsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOfferMappingsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOfferMappingsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerMappings',
  };
}

