#color sqls
color.add = INSERT into COLOR(color_name) values (:colorName)
color.getAll = SELECT * from COLOR
color.getById = SELECT * from COLOR where color_id = :colorId
color.remove = DELETE from COLOR where color_id = :colorId

#seller sqls
seller.add = INSERT into SELLER(seller_name) values (:sellerName)
seller.getAll = SELECT * from SELLER
seller.getById = SELECT * from SELLER where seller_id = :sellerId
seller.remove = DELETE from SELLER where seller_id = :sellerId
seller.update = UPDATE SELLER set seller_name = :sellerName where seller_id = :sellerId

#supplier sqls
supplier.add = INSERT into SUPPLIER(supplier_name) values (:supplierName)
supplier.getAll = SELECT * from SUPPLIER
supplier.getById = SELECT * from SUPPLIER where supplier_id = :supplierId
supplier.remove = DELETE from SUPPLIER where supplier_id = :supplierId
supplier.update = UPDATE SUPPLIER set supplier_name = :supplierName where supplier_id = :supplierId

#MEASUREMENT_UNIT sqls
measurementUnit.add = INSERT into MEASUREMENT_UNIT(measurement_unit_name) values (:measurementUnitName)
measurementUnit.getAll = SELECT * from MEASUREMENT_UNIT
measurementUnit.getByName = SELECT * from MEASUREMENT_UNIT where measurement_unit_id = :measurementUnitId
measurementUnit.remove = DELETE from MEASUREMENT_UNIT where measurement_unit_id = :measurementUnitId

#Product sqls
product.add = INSERT into PRODUCT(product_name, color_id, size, measurement_unit_id) values (:productName, :color_id, :size, :measurement_unit_id)
product.getById = SELECT * from PRODUCT where product_id = :productId
product.getAll = SELECT * from PRODUCT
product.getByIds = SELECT * from PRODUCT where product_id in (:productIds)
product.remove = DELETE from PRODUCT where product_id = :productId
product.update = UPDATE PRODUCT set productName = :productName where product_id = :productId

#product_supplier
product_supplier.add = INSERT into PRODUCT_SUPPLIER(product_id, supplier_id) values (:productId, :supplierId)
product_supplier.getByProductId = SELECT * from PRODUCT_SUPPLIER where product_id = :productId
product_supplier.getBySupplierId = SELECT * from PRODUCT_SUPPLIER where supplier_id = :supplierId
product_supplier.removeByPrdSuppId = DELETE from PRODUCT_SUPPLIER where product_id = :productId and supplier_id = :supplierId
product_supplier.removeByProductId = DELETE from PRODUCT_SUPPLIER where product_id = :productId
product_supplier.removeBySupplierId = DELETE from PRODUCT_SUPPLIER where supplier_id = :supplierId

#product_seller sqls
product_seller.add = INSERT into PRODUCT_SELLER(product_id, seller_id) values (:productId, :sellerId)
product_seller.getByProductId = SELECT * from PRODUCT_SELLER where product_id = :productId
product_seller.getBySellerId = SELECT * from PRODUCT_SELLER where seller_id = :sellerId
product_seller.removeByPrdSellId = DELETE from PRODUCT_SELLER where product_id = :productId and seller_id = :sellerId
product_seller.removeByProductId = DELETE from PRODUCT_SELLER where product_id = :productId
product_seller.removeBySellerId = DELETE from PRODUCT_SELLER where seller_id = :sellerId

