//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteOffersFromArchiveRequest {
  /// Returns a new [DeleteOffersFromArchiveRequest] instance.
  DeleteOffersFromArchiveRequest({
    this.offerIds = const [],
  });

  /// Список товаров, которые нужно восстановить из архива.
  List<String> offerIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteOffersFromArchiveRequest &&
    _deepEquality.equals(other.offerIds, offerIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerIds.hashCode);

  @override
  String toString() => 'DeleteOffersFromArchiveRequest[offerIds=$offerIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerIds'] = this.offerIds;
    return json;
  }

  /// Returns a new [DeleteOffersFromArchiveRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteOffersFromArchiveRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteOffersFromArchiveRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteOffersFromArchiveRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteOffersFromArchiveRequest(
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<DeleteOffersFromArchiveRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteOffersFromArchiveRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteOffersFromArchiveRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteOffersFromArchiveRequest> mapFromJson(dynamic json) {
    final map = <String, DeleteOffersFromArchiveRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteOffersFromArchiveRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteOffersFromArchiveRequest-objects as value to a dart map
  static Map<String, List<DeleteOffersFromArchiveRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteOffersFromArchiveRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteOffersFromArchiveRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerIds',
  };
}

