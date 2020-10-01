import Foundation
import ARLocalizerView
@objc(ArLocalizerRn)
class ArLocalizerRn: NSObject {
    
    @objc(createArView:resolver:rejecter:)
    func createArView( value: NSArray, resolver resolve: RCTPromiseResolveBlock, rejecter reject:RCTPromiseRejectBlock)-> Void {
        DispatchQueue.main.async(execute: {() -> Void in
            let poiProvider = ObjectPOIProvider(items: value)
            let arViewController = ARViewController(
                    viewModel: ARViewModel(poiProvider: poiProvider),
                poiLabelViewType: SimplePOILabelView.self
            )
            
            let viewController = UIApplication.shared.windows.first!.rootViewController as! UIViewController
            arViewController.modalPresentationStyle = UIModalPresentationStyle.currentContext
            let headerController = BackButtonViewController()
            headerController.view.frame = arViewController.view.bounds
            arViewController.view.addSubview(headerController.view)
            arViewController.addChild(headerController)
            headerController.didMove(toParent: arViewController)
            headerController.button.viewController = viewController
            headerController.button.addTarget(self, action: #selector(self.hideView), for: .touchUpInside)
            viewController.present(arViewController, animated: true)
            
        })
        
        resolve(true)
    }
    @objc func hideView(sender: BackButton!) {
        sender.viewController?.dismiss(animated: true)
    }
}
