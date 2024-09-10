//
// OutletLicenseDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о лицензии. 
public struct OutletLicenseDTO: Codable {
    /// Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
    public var id: Int64?
    /// Идентификатор точки продаж, для которой действительна лицензия.
    public var outletId: Int64?
    public var licenseType: LicenseType?
    /// Номер лицензии.
    public var number: String?
    /// Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
    public var dateOfIssue: Date?
    /// Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
    public var dateOfExpiry: Date?

    public init(id: Int64? = nil, outletId: Int64? = nil, licenseType: LicenseType? = nil, number: String? = nil, dateOfIssue: Date? = nil, dateOfExpiry: Date? = nil) {
        self.id = id
        self.outletId = outletId
        self.licenseType = licenseType
        self.number = number
        self.dateOfIssue = dateOfIssue
        self.dateOfExpiry = dateOfExpiry
    }
}
