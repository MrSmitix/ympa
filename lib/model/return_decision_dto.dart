//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ReturnDecisionDTO {
  /// Returns a new [ReturnDecisionDTO] instance.
  ReturnDecisionDTO({
    this.returnItemId,
    this.count,
    this.comment,
    this.reasonType,
    this.subreasonType,
    this.decisionType,
    this.refundAmount,
    this.partnerCompensation,
    this.images = const [],
  });

  /// Идентификатор товара в возврате.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? returnItemId;

  /// Количество единиц товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? count;

  /// Комментарий.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? comment;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReturnDecisionReasonType? reasonType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReturnDecisionSubreasonType? subreasonType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReturnDecisionType? decisionType;

  /// Сумма возврата.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? refundAmount;

  /// Компенсация за обратную доставку.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? partnerCompensation;

  /// Список хеш-кодов фотографий товара от покупателя.
  List<String>? images;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ReturnDecisionDTO &&
    other.returnItemId == returnItemId &&
    other.count == count &&
    other.comment == comment &&
    other.reasonType == reasonType &&
    other.subreasonType == subreasonType &&
    other.decisionType == decisionType &&
    other.refundAmount == refundAmount &&
    other.partnerCompensation == partnerCompensation &&
    _deepEquality.equals(other.images, images);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (returnItemId == null ? 0 : returnItemId!.hashCode) +
    (count == null ? 0 : count!.hashCode) +
    (comment == null ? 0 : comment!.hashCode) +
    (reasonType == null ? 0 : reasonType!.hashCode) +
    (subreasonType == null ? 0 : subreasonType!.hashCode) +
    (decisionType == null ? 0 : decisionType!.hashCode) +
    (refundAmount == null ? 0 : refundAmount!.hashCode) +
    (partnerCompensation == null ? 0 : partnerCompensation!.hashCode) +
    (images == null ? 0 : images!.hashCode);

  @override
  String toString() => 'ReturnDecisionDTO[returnItemId=$returnItemId, count=$count, comment=$comment, reasonType=$reasonType, subreasonType=$subreasonType, decisionType=$decisionType, refundAmount=$refundAmount, partnerCompensation=$partnerCompensation, images=$images]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.returnItemId != null) {
      json[r'returnItemId'] = this.returnItemId;
    } else {
      json[r'returnItemId'] = null;
    }
    if (this.count != null) {
      json[r'count'] = this.count;
    } else {
      json[r'count'] = null;
    }
    if (this.comment != null) {
      json[r'comment'] = this.comment;
    } else {
      json[r'comment'] = null;
    }
    if (this.reasonType != null) {
      json[r'reasonType'] = this.reasonType;
    } else {
      json[r'reasonType'] = null;
    }
    if (this.subreasonType != null) {
      json[r'subreasonType'] = this.subreasonType;
    } else {
      json[r'subreasonType'] = null;
    }
    if (this.decisionType != null) {
      json[r'decisionType'] = this.decisionType;
    } else {
      json[r'decisionType'] = null;
    }
    if (this.refundAmount != null) {
      json[r'refundAmount'] = this.refundAmount;
    } else {
      json[r'refundAmount'] = null;
    }
    if (this.partnerCompensation != null) {
      json[r'partnerCompensation'] = this.partnerCompensation;
    } else {
      json[r'partnerCompensation'] = null;
    }
    if (this.images != null) {
      json[r'images'] = this.images;
    } else {
      json[r'images'] = null;
    }
    return json;
  }

  /// Returns a new [ReturnDecisionDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ReturnDecisionDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ReturnDecisionDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ReturnDecisionDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ReturnDecisionDTO(
        returnItemId: mapValueOfType<int>(json, r'returnItemId'),
        count: mapValueOfType<int>(json, r'count'),
        comment: mapValueOfType<String>(json, r'comment'),
        reasonType: ReturnDecisionReasonType.fromJson(json[r'reasonType']),
        subreasonType: ReturnDecisionSubreasonType.fromJson(json[r'subreasonType']),
        decisionType: ReturnDecisionType.fromJson(json[r'decisionType']),
        refundAmount: mapValueOfType<int>(json, r'refundAmount'),
        partnerCompensation: mapValueOfType<int>(json, r'partnerCompensation'),
        images: json[r'images'] is Iterable
            ? (json[r'images'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ReturnDecisionDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnDecisionDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnDecisionDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ReturnDecisionDTO> mapFromJson(dynamic json) {
    final map = <String, ReturnDecisionDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ReturnDecisionDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ReturnDecisionDTO-objects as value to a dart map
  static Map<String, List<ReturnDecisionDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ReturnDecisionDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ReturnDecisionDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

