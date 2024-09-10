//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOfferContentRequest {
  /// Returns a new [UpdateOfferContentRequest] instance.
  UpdateOfferContentRequest({
    this.offersContent = const [],
  });

  /// Список товаров с указанными характеристиками.
  List<OfferContentDTO> offersContent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOfferContentRequest &&
    _deepEquality.equals(other.offersContent, offersContent);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offersContent.hashCode);

  @override
  String toString() => 'UpdateOfferContentRequest[offersContent=$offersContent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offersContent'] = this.offersContent;
    return json;
  }

  /// Returns a new [UpdateOfferContentRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOfferContentRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOfferContentRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOfferContentRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOfferContentRequest(
        offersContent: OfferContentDTO.listFromJson(json[r'offersContent']),
      );
    }
    return null;
  }

  static List<UpdateOfferContentRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOfferContentRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOfferContentRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOfferContentRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateOfferContentRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOfferContentRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOfferContentRequest-objects as value to a dart map
  static Map<String, List<UpdateOfferContentRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOfferContentRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOfferContentRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offersContent',
  };
}

