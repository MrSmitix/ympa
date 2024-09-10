//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SetReturnDecisionRequest {
  /// Returns a new [SetReturnDecisionRequest] instance.
  SetReturnDecisionRequest({
    required this.returnItemId,
    required this.decisionType,
    this.comment,
  });

  /// Идентификатор товара в возврате.
  int returnItemId;

  ReturnRequestDecisionType decisionType;

  /// Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? comment;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SetReturnDecisionRequest &&
    other.returnItemId == returnItemId &&
    other.decisionType == decisionType &&
    other.comment == comment;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (returnItemId.hashCode) +
    (decisionType.hashCode) +
    (comment == null ? 0 : comment!.hashCode);

  @override
  String toString() => 'SetReturnDecisionRequest[returnItemId=$returnItemId, decisionType=$decisionType, comment=$comment]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'returnItemId'] = this.returnItemId;
      json[r'decisionType'] = this.decisionType;
    if (this.comment != null) {
      json[r'comment'] = this.comment;
    } else {
      json[r'comment'] = null;
    }
    return json;
  }

  /// Returns a new [SetReturnDecisionRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SetReturnDecisionRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SetReturnDecisionRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SetReturnDecisionRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SetReturnDecisionRequest(
        returnItemId: mapValueOfType<int>(json, r'returnItemId')!,
        decisionType: ReturnRequestDecisionType.fromJson(json[r'decisionType'])!,
        comment: mapValueOfType<String>(json, r'comment'),
      );
    }
    return null;
  }

  static List<SetReturnDecisionRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SetReturnDecisionRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SetReturnDecisionRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SetReturnDecisionRequest> mapFromJson(dynamic json) {
    final map = <String, SetReturnDecisionRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SetReturnDecisionRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SetReturnDecisionRequest-objects as value to a dart map
  static Map<String, List<SetReturnDecisionRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SetReturnDecisionRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SetReturnDecisionRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'returnItemId',
    'decisionType',
  };
}

