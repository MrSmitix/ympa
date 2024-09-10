//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QuarantineOfferDTO {
  /// Returns a new [QuarantineOfferDTO] instance.
  QuarantineOfferDTO({
    this.offerId,
    this.currentPrice,
    this.lastValidPrice,
    this.verdicts = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? offerId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BasePriceDTO? currentPrice;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BasePriceDTO? lastValidPrice;

  /// Причины попадания товара в карантин.
  List<PriceQuarantineVerdictDTO>? verdicts;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QuarantineOfferDTO &&
    other.offerId == offerId &&
    other.currentPrice == currentPrice &&
    other.lastValidPrice == lastValidPrice &&
    _deepEquality.equals(other.verdicts, verdicts);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId == null ? 0 : offerId!.hashCode) +
    (currentPrice == null ? 0 : currentPrice!.hashCode) +
    (lastValidPrice == null ? 0 : lastValidPrice!.hashCode) +
    (verdicts == null ? 0 : verdicts!.hashCode);

  @override
  String toString() => 'QuarantineOfferDTO[offerId=$offerId, currentPrice=$currentPrice, lastValidPrice=$lastValidPrice, verdicts=$verdicts]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offerId != null) {
      json[r'offerId'] = this.offerId;
    } else {
      json[r'offerId'] = null;
    }
    if (this.currentPrice != null) {
      json[r'currentPrice'] = this.currentPrice;
    } else {
      json[r'currentPrice'] = null;
    }
    if (this.lastValidPrice != null) {
      json[r'lastValidPrice'] = this.lastValidPrice;
    } else {
      json[r'lastValidPrice'] = null;
    }
    if (this.verdicts != null) {
      json[r'verdicts'] = this.verdicts;
    } else {
      json[r'verdicts'] = null;
    }
    return json;
  }

  /// Returns a new [QuarantineOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QuarantineOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QuarantineOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QuarantineOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QuarantineOfferDTO(
        offerId: mapValueOfType<String>(json, r'offerId'),
        currentPrice: BasePriceDTO.fromJson(json[r'currentPrice']),
        lastValidPrice: BasePriceDTO.fromJson(json[r'lastValidPrice']),
        verdicts: PriceQuarantineVerdictDTO.listFromJson(json[r'verdicts']),
      );
    }
    return null;
  }

  static List<QuarantineOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuarantineOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuarantineOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QuarantineOfferDTO> mapFromJson(dynamic json) {
    final map = <String, QuarantineOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QuarantineOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QuarantineOfferDTO-objects as value to a dart map
  static Map<String, List<QuarantineOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QuarantineOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QuarantineOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

