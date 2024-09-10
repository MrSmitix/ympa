//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderBusinessDocumentsDTO {
  /// Returns a new [OrderBusinessDocumentsDTO] instance.
  OrderBusinessDocumentsDTO({
    this.upd,
    this.ukd,
    this.torgTwelve,
    this.sf,
    this.ksf,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DocumentDTO? upd;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DocumentDTO? ukd;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DocumentDTO? torgTwelve;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DocumentDTO? sf;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DocumentDTO? ksf;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderBusinessDocumentsDTO &&
    other.upd == upd &&
    other.ukd == ukd &&
    other.torgTwelve == torgTwelve &&
    other.sf == sf &&
    other.ksf == ksf;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (upd == null ? 0 : upd!.hashCode) +
    (ukd == null ? 0 : ukd!.hashCode) +
    (torgTwelve == null ? 0 : torgTwelve!.hashCode) +
    (sf == null ? 0 : sf!.hashCode) +
    (ksf == null ? 0 : ksf!.hashCode);

  @override
  String toString() => 'OrderBusinessDocumentsDTO[upd=$upd, ukd=$ukd, torgTwelve=$torgTwelve, sf=$sf, ksf=$ksf]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.upd != null) {
      json[r'upd'] = this.upd;
    } else {
      json[r'upd'] = null;
    }
    if (this.ukd != null) {
      json[r'ukd'] = this.ukd;
    } else {
      json[r'ukd'] = null;
    }
    if (this.torgTwelve != null) {
      json[r'torgTwelve'] = this.torgTwelve;
    } else {
      json[r'torgTwelve'] = null;
    }
    if (this.sf != null) {
      json[r'sf'] = this.sf;
    } else {
      json[r'sf'] = null;
    }
    if (this.ksf != null) {
      json[r'ksf'] = this.ksf;
    } else {
      json[r'ksf'] = null;
    }
    return json;
  }

  /// Returns a new [OrderBusinessDocumentsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderBusinessDocumentsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderBusinessDocumentsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderBusinessDocumentsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderBusinessDocumentsDTO(
        upd: DocumentDTO.fromJson(json[r'upd']),
        ukd: DocumentDTO.fromJson(json[r'ukd']),
        torgTwelve: DocumentDTO.fromJson(json[r'torgTwelve']),
        sf: DocumentDTO.fromJson(json[r'sf']),
        ksf: DocumentDTO.fromJson(json[r'ksf']),
      );
    }
    return null;
  }

  static List<OrderBusinessDocumentsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderBusinessDocumentsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderBusinessDocumentsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderBusinessDocumentsDTO> mapFromJson(dynamic json) {
    final map = <String, OrderBusinessDocumentsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderBusinessDocumentsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderBusinessDocumentsDTO-objects as value to a dart map
  static Map<String, List<OrderBusinessDocumentsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderBusinessDocumentsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderBusinessDocumentsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

