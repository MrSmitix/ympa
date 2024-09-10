//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AddOffersToArchiveDTO {
  /// Returns a new [AddOffersToArchiveDTO] instance.
  AddOffersToArchiveDTO({
    this.notArchivedOffers = const [],
  });

  /// Список товаров, которые не удалось поместить в архив.
  List<AddOffersToArchiveErrorDTO>? notArchivedOffers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AddOffersToArchiveDTO &&
    _deepEquality.equals(other.notArchivedOffers, notArchivedOffers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (notArchivedOffers == null ? 0 : notArchivedOffers!.hashCode);

  @override
  String toString() => 'AddOffersToArchiveDTO[notArchivedOffers=$notArchivedOffers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.notArchivedOffers != null) {
      json[r'notArchivedOffers'] = this.notArchivedOffers;
    } else {
      json[r'notArchivedOffers'] = null;
    }
    return json;
  }

  /// Returns a new [AddOffersToArchiveDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AddOffersToArchiveDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AddOffersToArchiveDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AddOffersToArchiveDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AddOffersToArchiveDTO(
        notArchivedOffers: AddOffersToArchiveErrorDTO.listFromJson(json[r'notArchivedOffers']),
      );
    }
    return null;
  }

  static List<AddOffersToArchiveDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AddOffersToArchiveDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AddOffersToArchiveDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AddOffersToArchiveDTO> mapFromJson(dynamic json) {
    final map = <String, AddOffersToArchiveDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AddOffersToArchiveDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AddOffersToArchiveDTO-objects as value to a dart map
  static Map<String, List<AddOffersToArchiveDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AddOffersToArchiveDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AddOffersToArchiveDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

