//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PromoOfferAutoParticipatingDetailsDTO {
  /// Returns a new [PromoOfferAutoParticipatingDetailsDTO] instance.
  PromoOfferAutoParticipatingDetailsDTO({
    this.campaignIds = const [],
  });

  /// Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
  List<int>? campaignIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PromoOfferAutoParticipatingDetailsDTO &&
    _deepEquality.equals(other.campaignIds, campaignIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignIds == null ? 0 : campaignIds!.hashCode);

  @override
  String toString() => 'PromoOfferAutoParticipatingDetailsDTO[campaignIds=$campaignIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.campaignIds != null) {
      json[r'campaignIds'] = this.campaignIds;
    } else {
      json[r'campaignIds'] = null;
    }
    return json;
  }

  /// Returns a new [PromoOfferAutoParticipatingDetailsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PromoOfferAutoParticipatingDetailsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PromoOfferAutoParticipatingDetailsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PromoOfferAutoParticipatingDetailsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PromoOfferAutoParticipatingDetailsDTO(
        campaignIds: json[r'campaignIds'] is Iterable
            ? (json[r'campaignIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<PromoOfferAutoParticipatingDetailsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromoOfferAutoParticipatingDetailsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromoOfferAutoParticipatingDetailsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PromoOfferAutoParticipatingDetailsDTO> mapFromJson(dynamic json) {
    final map = <String, PromoOfferAutoParticipatingDetailsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PromoOfferAutoParticipatingDetailsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PromoOfferAutoParticipatingDetailsDTO-objects as value to a dart map
  static Map<String, List<PromoOfferAutoParticipatingDetailsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PromoOfferAutoParticipatingDetailsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PromoOfferAutoParticipatingDetailsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

