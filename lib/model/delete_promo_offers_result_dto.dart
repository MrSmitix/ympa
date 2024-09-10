//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeletePromoOffersResultDTO {
  /// Returns a new [DeletePromoOffersResultDTO] instance.
  DeletePromoOffersResultDTO({
    this.rejectedOffers = const [],
  });

  /// Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
  List<RejectedPromoOfferDeleteDTO>? rejectedOffers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeletePromoOffersResultDTO &&
    _deepEquality.equals(other.rejectedOffers, rejectedOffers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rejectedOffers == null ? 0 : rejectedOffers!.hashCode);

  @override
  String toString() => 'DeletePromoOffersResultDTO[rejectedOffers=$rejectedOffers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.rejectedOffers != null) {
      json[r'rejectedOffers'] = this.rejectedOffers;
    } else {
      json[r'rejectedOffers'] = null;
    }
    return json;
  }

  /// Returns a new [DeletePromoOffersResultDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeletePromoOffersResultDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeletePromoOffersResultDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeletePromoOffersResultDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeletePromoOffersResultDTO(
        rejectedOffers: RejectedPromoOfferDeleteDTO.listFromJson(json[r'rejectedOffers']),
      );
    }
    return null;
  }

  static List<DeletePromoOffersResultDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePromoOffersResultDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePromoOffersResultDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeletePromoOffersResultDTO> mapFromJson(dynamic json) {
    final map = <String, DeletePromoOffersResultDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeletePromoOffersResultDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeletePromoOffersResultDTO-objects as value to a dart map
  static Map<String, List<DeletePromoOffersResultDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeletePromoOffersResultDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeletePromoOffersResultDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

