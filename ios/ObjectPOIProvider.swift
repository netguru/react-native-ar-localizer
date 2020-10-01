import ARLocalizerView
import Foundation


final public class ObjectPOIProvider: POIProvider {
    public var pois: [POI]

    public init(items: NSArray) {

        pois = []
        for case let poi as [String:AnyObject] in items {
            let point:POI = POI(name: poi["name"] as! NSString as String, latitude:poi["latitude"] as! Double,longitude:poi["longitude"] as! Double)
            pois.append(point)
         }

    }
}
