//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderItemInstanceDTO {
  /// Returns a new [OrderItemInstanceDTO] instance.
  OrderItemInstanceDTO({
    this.cis,
    this.cisFull,
    this.uin,
    this.rnpt,
    this.gtd,
  });

  /// Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? cis;

  /// Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? cisFull;

  /// УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? uin;

  /// Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? rnpt;

  /// Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? gtd;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderItemInstanceDTO &&
    other.cis == cis &&
    other.cisFull == cisFull &&
    other.uin == uin &&
    other.rnpt == rnpt &&
    other.gtd == gtd;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cis == null ? 0 : cis!.hashCode) +
    (cisFull == null ? 0 : cisFull!.hashCode) +
    (uin == null ? 0 : uin!.hashCode) +
    (rnpt == null ? 0 : rnpt!.hashCode) +
    (gtd == null ? 0 : gtd!.hashCode);

  @override
  String toString() => 'OrderItemInstanceDTO[cis=$cis, cisFull=$cisFull, uin=$uin, rnpt=$rnpt, gtd=$gtd]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cis != null) {
      json[r'cis'] = this.cis;
    } else {
      json[r'cis'] = null;
    }
    if (this.cisFull != null) {
      json[r'cisFull'] = this.cisFull;
    } else {
      json[r'cisFull'] = null;
    }
    if (this.uin != null) {
      json[r'uin'] = this.uin;
    } else {
      json[r'uin'] = null;
    }
    if (this.rnpt != null) {
      json[r'rnpt'] = this.rnpt;
    } else {
      json[r'rnpt'] = null;
    }
    if (this.gtd != null) {
      json[r'gtd'] = this.gtd;
    } else {
      json[r'gtd'] = null;
    }
    return json;
  }

  /// Returns a new [OrderItemInstanceDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderItemInstanceDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderItemInstanceDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderItemInstanceDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderItemInstanceDTO(
        cis: mapValueOfType<String>(json, r'cis'),
        cisFull: mapValueOfType<String>(json, r'cisFull'),
        uin: mapValueOfType<String>(json, r'uin'),
        rnpt: mapValueOfType<String>(json, r'rnpt'),
        gtd: mapValueOfType<String>(json, r'gtd'),
      );
    }
    return null;
  }

  static List<OrderItemInstanceDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemInstanceDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemInstanceDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderItemInstanceDTO> mapFromJson(dynamic json) {
    final map = <String, OrderItemInstanceDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderItemInstanceDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderItemInstanceDTO-objects as value to a dart map
  static Map<String, List<OrderItemInstanceDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderItemInstanceDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderItemInstanceDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

