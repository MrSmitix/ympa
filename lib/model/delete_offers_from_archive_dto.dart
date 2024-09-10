//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteOffersFromArchiveDTO {
  /// Returns a new [DeleteOffersFromArchiveDTO] instance.
  DeleteOffersFromArchiveDTO({
    this.notUnarchivedOfferIds = const [],
  });

  /// Список товаров, которые не удалось восстановить из архива.
  List<String>? notUnarchivedOfferIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteOffersFromArchiveDTO &&
    _deepEquality.equals(other.notUnarchivedOfferIds, notUnarchivedOfferIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (notUnarchivedOfferIds == null ? 0 : notUnarchivedOfferIds!.hashCode);

  @override
  String toString() => 'DeleteOffersFromArchiveDTO[notUnarchivedOfferIds=$notUnarchivedOfferIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.notUnarchivedOfferIds != null) {
      json[r'notUnarchivedOfferIds'] = this.notUnarchivedOfferIds;
    } else {
      json[r'notUnarchivedOfferIds'] = null;
    }
    return json;
  }

  /// Returns a new [DeleteOffersFromArchiveDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteOffersFromArchiveDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteOffersFromArchiveDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteOffersFromArchiveDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteOffersFromArchiveDTO(
        notUnarchivedOfferIds: json[r'notUnarchivedOfferIds'] is Iterable
            ? (json[r'notUnarchivedOfferIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<DeleteOffersFromArchiveDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteOffersFromArchiveDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteOffersFromArchiveDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteOffersFromArchiveDTO> mapFromJson(dynamic json) {
    final map = <String, DeleteOffersFromArchiveDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteOffersFromArchiveDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteOffersFromArchiveDTO-objects as value to a dart map
  static Map<String, List<DeleteOffersFromArchiveDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteOffersFromArchiveDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteOffersFromArchiveDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

