//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdatePromoOffersResultDTO {
  /// Returns a new [UpdatePromoOffersResultDTO] instance.
  UpdatePromoOffersResultDTO({
    this.rejectedOffers = const [],
    this.warningOffers = const [],
  });

  /// Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
  List<RejectedPromoOfferUpdateDTO>? rejectedOffers;

  /// Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
  List<WarningPromoOfferUpdateDTO>? warningOffers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdatePromoOffersResultDTO &&
    _deepEquality.equals(other.rejectedOffers, rejectedOffers) &&
    _deepEquality.equals(other.warningOffers, warningOffers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rejectedOffers == null ? 0 : rejectedOffers!.hashCode) +
    (warningOffers == null ? 0 : warningOffers!.hashCode);

  @override
  String toString() => 'UpdatePromoOffersResultDTO[rejectedOffers=$rejectedOffers, warningOffers=$warningOffers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.rejectedOffers != null) {
      json[r'rejectedOffers'] = this.rejectedOffers;
    } else {
      json[r'rejectedOffers'] = null;
    }
    if (this.warningOffers != null) {
      json[r'warningOffers'] = this.warningOffers;
    } else {
      json[r'warningOffers'] = null;
    }
    return json;
  }

  /// Returns a new [UpdatePromoOffersResultDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdatePromoOffersResultDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdatePromoOffersResultDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdatePromoOffersResultDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdatePromoOffersResultDTO(
        rejectedOffers: RejectedPromoOfferUpdateDTO.listFromJson(json[r'rejectedOffers']),
        warningOffers: WarningPromoOfferUpdateDTO.listFromJson(json[r'warningOffers']),
      );
    }
    return null;
  }

  static List<UpdatePromoOffersResultDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdatePromoOffersResultDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdatePromoOffersResultDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdatePromoOffersResultDTO> mapFromJson(dynamic json) {
    final map = <String, UpdatePromoOffersResultDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdatePromoOffersResultDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdatePromoOffersResultDTO-objects as value to a dart map
  static Map<String, List<UpdatePromoOffersResultDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdatePromoOffersResultDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdatePromoOffersResultDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

