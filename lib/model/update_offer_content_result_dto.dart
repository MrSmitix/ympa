//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOfferContentResultDTO {
  /// Returns a new [UpdateOfferContentResultDTO] instance.
  UpdateOfferContentResultDTO({
    required this.offerId,
    this.errors = const [],
    this.warnings = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  /// Ошибки — информация в каталоге не обновится.
  List<OfferContentErrorDTO>? errors;

  /// Предупреждения — информация в каталоге обновится.
  List<OfferContentErrorDTO>? warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOfferContentResultDTO &&
    other.offerId == offerId &&
    _deepEquality.equals(other.errors, errors) &&
    _deepEquality.equals(other.warnings, warnings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (errors == null ? 0 : errors!.hashCode) +
    (warnings == null ? 0 : warnings!.hashCode);

  @override
  String toString() => 'UpdateOfferContentResultDTO[offerId=$offerId, errors=$errors, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
    if (this.errors != null) {
      json[r'errors'] = this.errors;
    } else {
      json[r'errors'] = null;
    }
    if (this.warnings != null) {
      json[r'warnings'] = this.warnings;
    } else {
      json[r'warnings'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateOfferContentResultDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOfferContentResultDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOfferContentResultDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOfferContentResultDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOfferContentResultDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        errors: OfferContentErrorDTO.listFromJson(json[r'errors']),
        warnings: OfferContentErrorDTO.listFromJson(json[r'warnings']),
      );
    }
    return null;
  }

  static List<UpdateOfferContentResultDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOfferContentResultDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOfferContentResultDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOfferContentResultDTO> mapFromJson(dynamic json) {
    final map = <String, UpdateOfferContentResultDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOfferContentResultDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOfferContentResultDTO-objects as value to a dart map
  static Map<String, List<UpdateOfferContentResultDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOfferContentResultDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOfferContentResultDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
  };
}

